package io.burkard.cdk.services.iotevents

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDetectorModel {

  def apply(
    internalResourceId: String,
    detectorModelDescription: Option[String] = None,
    detectorModelDefinition: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.DetectorModelDefinitionProperty] = None,
    detectorModelName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    evaluationMethod: Option[String] = None,
    key: Option[String] = None,
    roleArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iotevents.CfnDetectorModel =
    software.amazon.awscdk.services.iotevents.CfnDetectorModel.Builder
      .create(stackCtx, internalResourceId)
      .detectorModelDescription(detectorModelDescription.orNull)
      .detectorModelDefinition(detectorModelDefinition.orNull)
      .detectorModelName(detectorModelName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .evaluationMethod(evaluationMethod.orNull)
      .key(key.orNull)
      .roleArn(roleArn.orNull)
      .build()
}
