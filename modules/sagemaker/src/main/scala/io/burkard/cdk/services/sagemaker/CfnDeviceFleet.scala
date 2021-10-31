package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDeviceFleet {

  def apply(
    internalResourceId: String,
    deviceFleetName: Option[String] = None,
    outputConfig: Option[software.amazon.awscdk.services.sagemaker.CfnDeviceFleet.EdgeOutputConfigProperty] = None,
    roleArn: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sagemaker.CfnDeviceFleet =
    software.amazon.awscdk.services.sagemaker.CfnDeviceFleet.Builder
      .create(stackCtx, internalResourceId)
      .deviceFleetName(deviceFleetName.orNull)
      .outputConfig(outputConfig.orNull)
      .roleArn(roleArn.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
