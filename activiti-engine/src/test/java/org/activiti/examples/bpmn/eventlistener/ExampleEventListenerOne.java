/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.activiti.examples.bpmn.eventlistener;

import org.activiti.pvm.event.EventListener;
import org.activiti.pvm.event.EventListenerExecution;

/**
 * Simple {@link EventListener} that sets 2 variables on the execution.
 * 
 * @author Frederik Heremans
 */
public class ExampleEventListenerOne implements EventListener {

  public void notify(EventListenerExecution execution) throws Exception {
    execution.setVariable("variableSetInEventListener", "firstValue");
    execution.setVariable("eventNameReceived", execution.getEventName());
  }
}
