package io.burkard.cdk.services.iot

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AddThingsToThingGroupParamsProperty {

  def apply(
    thingGroupNames: Option[List[String]] = None,
    overrideDynamicGroups: Option[Boolean] = None
  ): software.amazon.awscdk.services.iot.CfnMitigationAction.AddThingsToThingGroupParamsProperty =
    (new software.amazon.awscdk.services.iot.CfnMitigationAction.AddThingsToThingGroupParamsProperty.Builder)
      .thingGroupNames(thingGroupNames.map(_.asJava).orNull)
      .overrideDynamicGroups(overrideDynamicGroups.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
