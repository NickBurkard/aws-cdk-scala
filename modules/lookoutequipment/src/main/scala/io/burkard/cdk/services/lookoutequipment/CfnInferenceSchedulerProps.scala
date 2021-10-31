package io.burkard.cdk.services.lookoutequipment

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnInferenceSchedulerProps {

  def apply(
    inferenceSchedulerName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    dataUploadFrequency: Option[String] = None,
    dataInputConfiguration: Option[AnyRef] = None,
    modelName: Option[String] = None,
    roleArn: Option[String] = None,
    dataDelayOffsetInMinutes: Option[Number] = None,
    serverSideKmsKeyId: Option[String] = None,
    dataOutputConfiguration: Option[AnyRef] = None
  ): software.amazon.awscdk.services.lookoutequipment.CfnInferenceSchedulerProps =
    (new software.amazon.awscdk.services.lookoutequipment.CfnInferenceSchedulerProps.Builder)
      .inferenceSchedulerName(inferenceSchedulerName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .dataUploadFrequency(dataUploadFrequency.orNull)
      .dataInputConfiguration(dataInputConfiguration.orNull)
      .modelName(modelName.orNull)
      .roleArn(roleArn.orNull)
      .dataDelayOffsetInMinutes(dataDelayOffsetInMinutes.orNull)
      .serverSideKmsKeyId(serverSideKmsKeyId.orNull)
      .dataOutputConfiguration(dataOutputConfiguration.orNull)
      .build()
}
