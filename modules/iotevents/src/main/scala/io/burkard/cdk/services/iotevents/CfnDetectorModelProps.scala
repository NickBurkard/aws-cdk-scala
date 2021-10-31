package io.burkard.cdk.services.iotevents

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDetectorModelProps {

  def apply(
    detectorModelDescription: Option[String] = None,
    detectorModelDefinition: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.DetectorModelDefinitionProperty] = None,
    detectorModelName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    evaluationMethod: Option[String] = None,
    key: Option[String] = None,
    roleArn: Option[String] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModelProps =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModelProps.Builder)
      .detectorModelDescription(detectorModelDescription.orNull)
      .detectorModelDefinition(detectorModelDefinition.orNull)
      .detectorModelName(detectorModelName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .evaluationMethod(evaluationMethod.orNull)
      .key(key.orNull)
      .roleArn(roleArn.orNull)
      .build()
}
