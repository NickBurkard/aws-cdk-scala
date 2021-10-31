package io.burkard.cdk.services.medialive

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OutputGroupProperty {

  def apply(
    name: Option[String] = None,
    outputs: Option[List[_]] = None,
    outputGroupSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.OutputGroupSettingsProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.OutputGroupProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.OutputGroupProperty.Builder)
      .name(name.orNull)
      .outputs(outputs.map(_.asJava).orNull)
      .outputGroupSettings(outputGroupSettings.orNull)
      .build()
}
