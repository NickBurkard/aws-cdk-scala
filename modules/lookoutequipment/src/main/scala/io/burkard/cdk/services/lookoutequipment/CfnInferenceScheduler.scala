package io.burkard.cdk.services.lookoutequipment

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnInferenceScheduler {

  def apply(
    internalResourceId: String,
    dataUploadFrequency: String,
    dataInputConfiguration: AnyRef,
    modelName: String,
    roleArn: String,
    dataOutputConfiguration: AnyRef,
    inferenceSchedulerName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    dataDelayOffsetInMinutes: Option[Number] = None,
    serverSideKmsKeyId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler =
    software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.Builder
      .create(stackCtx, internalResourceId)
      .dataUploadFrequency(dataUploadFrequency)
      .dataInputConfiguration(dataInputConfiguration)
      .modelName(modelName)
      .roleArn(roleArn)
      .dataOutputConfiguration(dataOutputConfiguration)
      .inferenceSchedulerName(inferenceSchedulerName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .dataDelayOffsetInMinutes(dataDelayOffsetInMinutes.orNull)
      .serverSideKmsKeyId(serverSideKmsKeyId.orNull)
      .build()
}
