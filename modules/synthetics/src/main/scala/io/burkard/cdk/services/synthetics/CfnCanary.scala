package io.burkard.cdk.services.synthetics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCanary {

  def apply(
    internalResourceId: String,
    visualReference: Option[software.amazon.awscdk.services.synthetics.CfnCanary.VisualReferenceProperty] = None,
    failureRetentionPeriod: Option[Number] = None,
    vpcConfig: Option[software.amazon.awscdk.services.synthetics.CfnCanary.VPCConfigProperty] = None,
    startCanaryAfterCreation: Option[Boolean] = None,
    name: Option[String] = None,
    artifactS3Location: Option[String] = None,
    successRetentionPeriod: Option[Number] = None,
    runConfig: Option[software.amazon.awscdk.services.synthetics.CfnCanary.RunConfigProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    code: Option[software.amazon.awscdk.services.synthetics.CfnCanary.CodeProperty] = None,
    runtimeVersion: Option[String] = None,
    executionRoleArn: Option[String] = None,
    schedule: Option[software.amazon.awscdk.services.synthetics.CfnCanary.ScheduleProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.synthetics.CfnCanary =
    software.amazon.awscdk.services.synthetics.CfnCanary.Builder
      .create(stackCtx, internalResourceId)
      .visualReference(visualReference.orNull)
      .failureRetentionPeriod(failureRetentionPeriod.orNull)
      .vpcConfig(vpcConfig.orNull)
      .startCanaryAfterCreation(startCanaryAfterCreation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .name(name.orNull)
      .artifactS3Location(artifactS3Location.orNull)
      .successRetentionPeriod(successRetentionPeriod.orNull)
      .runConfig(runConfig.orNull)
      .tags(tags.map(_.asJava).orNull)
      .code(code.orNull)
      .runtimeVersion(runtimeVersion.orNull)
      .executionRoleArn(executionRoleArn.orNull)
      .schedule(schedule.orNull)
      .build()
}
