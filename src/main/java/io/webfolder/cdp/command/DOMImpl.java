/**
 * cdp4j Commercial License
 *
 * Copyright 2017, 2020 WebFolder OÜ
 *
 * Permission  is hereby  granted,  to "____" obtaining  a  copy of  this software  and
 * associated  documentation files  (the "Software"), to deal in  the Software  without
 * restriction, including without limitation  the rights  to use, copy, modify,  merge,
 * publish, distribute  and sublicense  of the Software,  and to permit persons to whom
 * the Software is furnished to do so, subject to the following conditions:
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR  IMPLIED,
 * INCLUDING  BUT NOT  LIMITED  TO THE  WARRANTIES  OF  MERCHANTABILITY, FITNESS  FOR A
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL  THE AUTHORS  OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF
 * CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE
 * OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package io.webfolder.cdp.command;

import java.util.List;

import com.google.gson.reflect.TypeToken;

import io.webfolder.cdp.session.SessionInvocationHandler;
import io.webfolder.cdp.type.dom.BoxModel;
import io.webfolder.cdp.type.dom.GetFrameOwnerResult;
import io.webfolder.cdp.type.dom.GetNodeForLocationResult;
import io.webfolder.cdp.type.dom.Node;
import io.webfolder.cdp.type.dom.PerformSearchResult;
import io.webfolder.cdp.type.runtime.RemoteObject;
import io.webfolder.cdp.type.runtime.StackTrace;

public class DOMImpl implements DOM {

    private static final Object[] EMPTY_VALUES = new Object[]{};
    private static final String[] EMPTY_ARGS = new String[]{};
    private final SessionInvocationHandler handler;
    private static final TypeToken<List<String>> TT_LIST_STRING = new TypeToken<List<String>>() { };
    private static final TypeToken<List<List<Double>>> TT_LIST_DOUBLE = new TypeToken<List<List<Double>>>() { };
    private static final TypeToken<List<Node>> TT_LIST_NODE = new TypeToken<List<Node>>() { };
    private static final TypeToken<List<Integer>> TT_LIST_INTEGER = new TypeToken<List<Integer>>() { };

    public DOMImpl(SessionInvocationHandler handler) {
        this.handler = handler;
    }

    @Override
    @java.lang.SuppressWarnings("unchecked")
    public List<String> collectClassNamesFromSubtree(Integer nodeId) {
        return (List<String>) handler.invoke("DOM", "collectClassNamesFromSubtree", "DOM.collectClassNamesFromSubtree",
                "classNames", List.class, TT_LIST_STRING.getType(), false, false, false,
                new String[]{"nodeId"}, new Object[]{nodeId});
    }

    @Override
    public Integer copyTo(Integer nodeId, Integer targetNodeId, Integer insertBeforeNodeId) {
        return (Integer) handler.invoke("DOM", "copyTo", "DOM.copyTo", "nodeId", Integer.class, null, false, false,
                false, new String[]{"nodeId", "targetNodeId", "insertBeforeNodeId"},
                new Object[]{nodeId, targetNodeId, insertBeforeNodeId});
    }

    @Override
    public Node describeNode(Integer nodeId, Integer backendNodeId, String objectId, Integer depth, Boolean pierce) {
        return (Node) handler.invoke("DOM", "describeNode", "DOM.describeNode", "node", Node.class, null, false, false,
                false, new String[]{"nodeId", "backendNodeId", "objectId", "depth", "pierce"},
                new Object[]{nodeId, backendNodeId, objectId, depth, pierce});
    }

    @Override
    public void disable() {
        handler.invoke("DOM", "disable", "DOM.disable", null, void.class, null, true, false, true, EMPTY_ARGS,
                EMPTY_VALUES);
    }

    @Override
    public void discardSearchResults(String searchId) {
        handler.invoke("DOM", "discardSearchResults", "DOM.discardSearchResults", null, void.class, null, true, false,
                false, new String[]{"searchId"}, new Object[]{searchId});
    }

    @Override
    public void enable() {
        handler.invoke("DOM", "enable", "DOM.enable", null, void.class, null, true, true, false, EMPTY_ARGS,
                EMPTY_VALUES);
    }

    @Override
    public void focus(Integer nodeId, Integer backendNodeId, String objectId) {
        handler.invoke("DOM", "focus", "DOM.focus", null, void.class, null, true, false, false,
                new String[]{"nodeId", "backendNodeId", "objectId"}, new Object[]{nodeId, backendNodeId, objectId});
    }

    @Override
    @java.lang.SuppressWarnings("unchecked")
    public List<String> getAttributes(Integer nodeId) {
        return (List<String>) handler.invoke("DOM", "getAttributes", "DOM.getAttributes", "attributes", List.class,
                TT_LIST_STRING.getType(), false, false, false, new String[]{"nodeId"}, new Object[]{nodeId});
    }

    @Override
    public BoxModel getBoxModel(Integer nodeId, Integer backendNodeId, String objectId) {
        return (BoxModel) handler.invoke("DOM", "getBoxModel", "DOM.getBoxModel", "model", BoxModel.class, null, false,
                false, false, new String[]{"nodeId", "backendNodeId", "objectId"},
                new Object[]{nodeId, backendNodeId, objectId});
    }

    @Override
    @java.lang.SuppressWarnings("unchecked")
    public List<List<Double>> getContentQuads(Integer nodeId, Integer backendNodeId, String objectId) {
        return (List<List<Double>>) handler.invoke("DOM", "getContentQuads", "DOM.getContentQuads", "quads", List.class,
                TT_LIST_DOUBLE.getType(), false, false, false, new String[]{"nodeId", "backendNodeId", "objectId"},
                new Object[]{nodeId, backendNodeId, objectId});
    }

    @Override
    public Node getDocument(Integer depth, Boolean pierce) {
        return (Node) handler.invoke("DOM", "getDocument", "DOM.getDocument", "root", Node.class, null, false, false,
                false, new String[]{"depth", "pierce"}, new Object[]{depth, pierce});
    }

    @Override
    @java.lang.SuppressWarnings("unchecked")
    public List<Node> getFlattenedDocument(Integer depth, Boolean pierce) {
        return (List<Node>) handler.invoke("DOM", "getFlattenedDocument", "DOM.getFlattenedDocument", "nodes",
                List.class, TT_LIST_NODE.getType(), false, false, false, new String[]{"depth", "pierce"},
                new Object[]{depth, pierce});
    }

    @Override
    public GetNodeForLocationResult getNodeForLocation(Integer x, Integer y, Boolean includeUserAgentShadowDOM,
            Boolean ignorePointerEventsNone) {
        return (GetNodeForLocationResult) handler.invoke("DOM", "getNodeForLocation", "DOM.getNodeForLocation", null,
                GetNodeForLocationResult.class, null, false, false, false,
                new String[]{"x", "y", "includeUserAgentShadowDOM", "ignorePointerEventsNone"},
                new Object[]{x, y, includeUserAgentShadowDOM, ignorePointerEventsNone});
    }

    @Override
    public String getOuterHTML(Integer nodeId, Integer backendNodeId, String objectId) {
        return (String) handler.invoke("DOM", "getOuterHTML", "DOM.getOuterHTML", "outerHTML", String.class, null,
                false, false, false, new String[]{"nodeId", "backendNodeId", "objectId"},
                new Object[]{nodeId, backendNodeId, objectId});
    }

    @Override
    public Integer getRelayoutBoundary(Integer nodeId) {
        return (Integer) handler.invoke("DOM", "getRelayoutBoundary", "DOM.getRelayoutBoundary", "nodeId",
                Integer.class, null, false, false, false, new String[]{"nodeId"}, new Object[]{nodeId});
    }

    @Override
    @java.lang.SuppressWarnings("unchecked")
    public List<Integer> getSearchResults(String searchId, Integer fromIndex, Integer toIndex) {
        return (List<Integer>) handler.invoke("DOM", "getSearchResults", "DOM.getSearchResults", "nodeIds", List.class,
                TT_LIST_INTEGER.getType(), false, false, false, new String[]{"searchId", "fromIndex", "toIndex"},
                new Object[]{searchId, fromIndex, toIndex});
    }

    @Override
    public void hideHighlight() {
        handler.invoke("DOM", "hideHighlight", "DOM.hideHighlight", null, void.class, null, true, false, false,
                EMPTY_ARGS, EMPTY_VALUES);
    }

    @Override
    public void highlightNode() {
        handler.invoke("DOM", "highlightNode", "DOM.highlightNode", null, void.class, null, true, false, false,
                EMPTY_ARGS, EMPTY_VALUES);
    }

    @Override
    public void highlightRect() {
        handler.invoke("DOM", "highlightRect", "DOM.highlightRect", null, void.class, null, true, false, false,
                EMPTY_ARGS, EMPTY_VALUES);
    }

    @Override
    public void markUndoableState() {
        handler.invoke("DOM", "markUndoableState", "DOM.markUndoableState", null, void.class, null, true, false, false,
                EMPTY_ARGS, EMPTY_VALUES);
    }

    @Override
    public Integer moveTo(Integer nodeId, Integer targetNodeId, Integer insertBeforeNodeId) {
        return (Integer) handler.invoke("DOM", "moveTo", "DOM.moveTo", "nodeId", Integer.class, null, false, false,
                false, new String[]{"nodeId", "targetNodeId", "insertBeforeNodeId"},
                new Object[]{nodeId, targetNodeId, insertBeforeNodeId});
    }

    @Override
    public PerformSearchResult performSearch(String query, Boolean includeUserAgentShadowDOM) {
        return (PerformSearchResult) handler.invoke("DOM", "performSearch", "DOM.performSearch", null,
                PerformSearchResult.class, null, false, false, false,
                new String[]{"query", "includeUserAgentShadowDOM"}, new Object[]{query, includeUserAgentShadowDOM});
    }

    @Override
    public Integer pushNodeByPathToFrontend(String path) {
        return (Integer) handler.invoke("DOM", "pushNodeByPathToFrontend", "DOM.pushNodeByPathToFrontend", "nodeId",
                Integer.class, null, false, false, false, new String[]{"path"}, new Object[]{path});
    }

    @Override
    @java.lang.SuppressWarnings("unchecked")
    public List<Integer> pushNodesByBackendIdsToFrontend(List<Integer> backendNodeIds) {
        return (List<Integer>) handler.invoke("DOM", "pushNodesByBackendIdsToFrontend",
                "DOM.pushNodesByBackendIdsToFrontend", "nodeIds", List.class,
                TT_LIST_INTEGER.getType(), false, false, false, new String[]{"backendNodeIds"},
                new Object[]{backendNodeIds});
    }

    @Override
    public Integer querySelector(Integer nodeId, String selector) {
        return (Integer) handler.invoke("DOM", "querySelector", "DOM.querySelector", "nodeId", Integer.class, null,
                false, false, false, new String[]{"nodeId", "selector"}, new Object[]{nodeId, selector});
    }

    @Override
    @java.lang.SuppressWarnings("unchecked")
    public List<Integer> querySelectorAll(Integer nodeId, String selector) {
        return (List<Integer>) handler.invoke("DOM", "querySelectorAll", "DOM.querySelectorAll", "nodeIds", List.class,
                TT_LIST_INTEGER.getType(), false, false, false, new String[]{"nodeId", "selector"},
                new Object[]{nodeId, selector});
    }

    @Override
    public void redo() {
        handler.invoke("DOM", "redo", "DOM.redo", null, void.class, null, true, false, false, EMPTY_ARGS, EMPTY_VALUES);
    }

    @Override
    public void removeAttribute(Integer nodeId, String name) {
        handler.invoke("DOM", "removeAttribute", "DOM.removeAttribute", null, void.class, null, true, false, false,
                new String[]{"nodeId", "name"}, new Object[]{nodeId, name});
    }

    @Override
    public void removeNode(Integer nodeId) {
        handler.invoke("DOM", "removeNode", "DOM.removeNode", null, void.class, null, true, false, false,
                new String[]{"nodeId"}, new Object[]{nodeId});
    }

    @Override
    public void requestChildNodes(Integer nodeId, Integer depth, Boolean pierce) {
        handler.invoke("DOM", "requestChildNodes", "DOM.requestChildNodes", null, void.class, null, true, false, false,
                new String[]{"nodeId", "depth", "pierce"}, new Object[]{nodeId, depth, pierce});
    }

    @Override
    public Integer requestNode(String objectId) {
        return (Integer) handler.invoke("DOM", "requestNode", "DOM.requestNode", "nodeId", Integer.class, null, false,
                false, false, new String[]{"objectId"}, new Object[]{objectId});
    }

    @Override
    public RemoteObject resolveNode(Integer nodeId, Integer backendNodeId, String objectGroup,
            Integer executionContextId) {
        return (RemoteObject) handler.invoke("DOM", "resolveNode", "DOM.resolveNode", "object", RemoteObject.class,
                null, false, false, false, new String[]{"nodeId", "backendNodeId", "objectGroup", "executionContextId"},
                new Object[]{nodeId, backendNodeId, objectGroup, executionContextId});
    }

    @Override
    public void setAttributeValue(Integer nodeId, String name, String value) {
        handler.invoke("DOM", "setAttributeValue", "DOM.setAttributeValue", null, void.class, null, true, false, false,
                new String[]{"nodeId", "name", "value"}, new Object[]{nodeId, name, value});
    }

    @Override
    public void setAttributesAsText(Integer nodeId, String text, String name) {
        handler.invoke("DOM", "setAttributesAsText", "DOM.setAttributesAsText", null, void.class, null, true, false,
                false, new String[]{"nodeId", "text", "name"}, new Object[]{nodeId, text, name});
    }

    @Override
    public void setFileInputFiles(List<String> files, Integer nodeId, Integer backendNodeId, String objectId) {
        handler.invoke("DOM", "setFileInputFiles", "DOM.setFileInputFiles", null, void.class, null, true, false, false,
                new String[]{"files", "nodeId", "backendNodeId", "objectId"},
                new Object[]{files, nodeId, backendNodeId, objectId});
    }

    @Override
    public void setNodeStackTracesEnabled(Boolean enable) {
        handler.invoke("DOM", "setNodeStackTracesEnabled", "DOM.setNodeStackTracesEnabled", null, void.class, null,
                true, false, false, new String[]{"enable"}, new Object[]{enable});
    }

    @Override
    public StackTrace getNodeStackTraces(Integer nodeId) {
        return (StackTrace) handler.invoke("DOM", "getNodeStackTraces", "DOM.getNodeStackTraces", "creation",
                StackTrace.class, null, false, false, false, new String[]{"nodeId"}, new Object[]{nodeId});
    }

    @Override
    public String getFileInfo(String objectId) {
        return (String) handler.invoke("DOM", "getFileInfo", "DOM.getFileInfo", "path", String.class, null, false,
                false, false, new String[]{"objectId"}, new Object[]{objectId});
    }

    @Override
    public void setInspectedNode(Integer nodeId) {
        handler.invoke("DOM", "setInspectedNode", "DOM.setInspectedNode", null, void.class, null, true, false, false,
                new String[]{"nodeId"}, new Object[]{nodeId});
    }

    @Override
    public Integer setNodeName(Integer nodeId, String name) {
        return (Integer) handler.invoke("DOM", "setNodeName", "DOM.setNodeName", "nodeId", Integer.class, null, false,
                false, false, new String[]{"nodeId", "name"}, new Object[]{nodeId, name});
    }

    @Override
    public void setNodeValue(Integer nodeId, String value) {
        handler.invoke("DOM", "setNodeValue", "DOM.setNodeValue", null, void.class, null, true, false, false,
                new String[]{"nodeId", "value"}, new Object[]{nodeId, value});
    }

    @Override
    public void setOuterHTML(Integer nodeId, String outerHTML) {
        handler.invoke("DOM", "setOuterHTML", "DOM.setOuterHTML", null, void.class, null, true, false, false,
                new String[]{"nodeId", "outerHTML"}, new Object[]{nodeId, outerHTML});
    }

    @Override
    public void undo() {
        handler.invoke("DOM", "undo", "DOM.undo", null, void.class, null, true, false, false, EMPTY_ARGS, EMPTY_VALUES);
    }

    @Override
    public GetFrameOwnerResult getFrameOwner(String frameId) {
        return (GetFrameOwnerResult) handler.invoke("DOM", "getFrameOwner", "DOM.getFrameOwner", null,
                GetFrameOwnerResult.class, null, false, false, false, new String[]{"frameId"}, new Object[]{frameId});
    }

    @Override
    public Integer copyTo(Integer nodeId, Integer targetNodeId) {
        return (Integer) handler.invoke("DOM", "copyTo", "DOM.copyTo", "nodeId", Integer.class, null, false, false,
                false, new String[]{"nodeId", "targetNodeId"}, new Object[]{nodeId, targetNodeId});
    }

    @Override
    public Node describeNode() {
        return (Node) handler.invoke("DOM", "describeNode", "DOM.describeNode", "node", Node.class, null, false, false,
                false, EMPTY_ARGS, EMPTY_VALUES);
    }

    @Override
    public void focus() {
        handler.invoke("DOM", "focus", "DOM.focus", null, void.class, null, true, false, false, EMPTY_ARGS,
                EMPTY_VALUES);
    }

    @Override
    public BoxModel getBoxModel() {
        return (BoxModel) handler.invoke("DOM", "getBoxModel", "DOM.getBoxModel", "model", BoxModel.class, null, false,
                false, false, EMPTY_ARGS, EMPTY_VALUES);
    }

    @Override
    @java.lang.SuppressWarnings("unchecked")
    public List<List<Double>> getContentQuads() {
        return (List<List<Double>>) handler.invoke("DOM", "getContentQuads", "DOM.getContentQuads", "quads", List.class,
                TT_LIST_DOUBLE.getType(), false, false, false, EMPTY_ARGS, EMPTY_VALUES);
    }

    @Override
    public Node getDocument() {
        return (Node) handler.invoke("DOM", "getDocument", "DOM.getDocument", "root", Node.class, null, false, false,
                false, EMPTY_ARGS, EMPTY_VALUES);
    }

    @Override
    @java.lang.SuppressWarnings("unchecked")
    public List<Node> getFlattenedDocument() {
        return (List<Node>) handler.invoke("DOM", "getFlattenedDocument", "DOM.getFlattenedDocument", "nodes",
                List.class, TT_LIST_NODE.getType(), false, false, false, EMPTY_ARGS, EMPTY_VALUES);
    }

    @Override
    public GetNodeForLocationResult getNodeForLocation(Integer x, Integer y) {
        return (GetNodeForLocationResult) handler.invoke("DOM", "getNodeForLocation", "DOM.getNodeForLocation", null,
                GetNodeForLocationResult.class, null, false, false, false, new String[]{"x", "y"}, new Object[]{x, y});
    }

    @Override
    public String getOuterHTML() {
        return (String) handler.invoke("DOM", "getOuterHTML", "DOM.getOuterHTML", "outerHTML", String.class, null,
                false, false, false, EMPTY_ARGS, EMPTY_VALUES);
    }

    @Override
    public Integer moveTo(Integer nodeId, Integer targetNodeId) {
        return (Integer) handler.invoke("DOM", "moveTo", "DOM.moveTo", "nodeId", Integer.class, null, false, false,
                false, new String[]{"nodeId", "targetNodeId"}, new Object[]{nodeId, targetNodeId});
    }

    @Override
    public PerformSearchResult performSearch(String query) {
        return (PerformSearchResult) handler.invoke("DOM", "performSearch", "DOM.performSearch", null,
                PerformSearchResult.class, null, false, false, false, new String[]{"query"}, new Object[]{query});
    }

    @Override
    public void requestChildNodes(Integer nodeId) {
        handler.invoke("DOM", "requestChildNodes", "DOM.requestChildNodes", null, void.class, null, true, false, false,
                new String[]{"nodeId"}, new Object[]{nodeId});
    }

    @Override
    public RemoteObject resolveNode() {
        return (RemoteObject) handler.invoke("DOM", "resolveNode", "DOM.resolveNode", "object", RemoteObject.class,
                null, false, false, false, EMPTY_ARGS, EMPTY_VALUES);
    }

    @Override
    public void setAttributesAsText(Integer nodeId, String text) {
        handler.invoke("DOM", "setAttributesAsText", "DOM.setAttributesAsText", null, void.class, null, true, false,
                false, new String[]{"nodeId", "text"}, new Object[]{nodeId, text});
    }

    @Override
    public void setFileInputFiles(List<String> files) {
        handler.invoke("DOM", "setFileInputFiles", "DOM.setFileInputFiles", null, void.class, null, true, false, false,
                new String[]{"files"}, new Object[]{files});
    }
}
