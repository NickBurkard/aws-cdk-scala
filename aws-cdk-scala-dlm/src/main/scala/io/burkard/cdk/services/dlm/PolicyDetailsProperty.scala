package io.burkard.cdk.services.dlm

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PolicyDetailsProperty {

  def apply(
    targetTags: Option[List[_]] = None,
    schedules: Option[List[_]] = None,
    policyType: Option[String] = None,
    actions: Option[List[_]] = None,
    parameters: Option[software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ParametersProperty] = None,
    resourceLocations: Option[List[String]] = None,
    eventSource: Option[software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventSourceProperty] = None,
    resourceTypes: Option[List[String]] = None
  ): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.PolicyDetailsProperty =
    (new software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.PolicyDetailsProperty.Builder)
      .targetTags(targetTags.map(_.asJava).orNull)
      .schedules(schedules.map(_.asJava).orNull)
      .policyType(policyType.orNull)
      .actions(actions.map(_.asJava).orNull)
      .parameters(parameters.orNull)
      .resourceLocations(resourceLocations.map(_.asJava).orNull)
      .eventSource(eventSource.orNull)
      .resourceTypes(resourceTypes.map(_.asJava).orNull)
      .build()
}
