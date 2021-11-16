package io.burkard.cdk.services.iot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AddThingsToThingGroupParamsProperty {

  def apply(
    thingGroupNames: List[String],
    overrideDynamicGroups: Option[Boolean] = None
  ): software.amazon.awscdk.services.iot.CfnMitigationAction.AddThingsToThingGroupParamsProperty =
    (new software.amazon.awscdk.services.iot.CfnMitigationAction.AddThingsToThingGroupParamsProperty.Builder)
      .thingGroupNames(thingGroupNames.asJava)
      .overrideDynamicGroups(overrideDynamicGroups.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
