package io.burkard.cdk.services.synthetics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCanaryProps {

  def apply(
    startCanaryAfterCreation: Boolean,
    name: String,
    artifactS3Location: String,
    code: software.amazon.awscdk.services.synthetics.CfnCanary.CodeProperty,
    runtimeVersion: String,
    executionRoleArn: String,
    schedule: software.amazon.awscdk.services.synthetics.CfnCanary.ScheduleProperty,
    visualReference: Option[software.amazon.awscdk.services.synthetics.CfnCanary.VisualReferenceProperty] = None,
    failureRetentionPeriod: Option[Number] = None,
    vpcConfig: Option[software.amazon.awscdk.services.synthetics.CfnCanary.VPCConfigProperty] = None,
    artifactConfig: Option[software.amazon.awscdk.services.synthetics.CfnCanary.ArtifactConfigProperty] = None,
    successRetentionPeriod: Option[Number] = None,
    runConfig: Option[software.amazon.awscdk.services.synthetics.CfnCanary.RunConfigProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.synthetics.CfnCanaryProps =
    (new software.amazon.awscdk.services.synthetics.CfnCanaryProps.Builder)
      .startCanaryAfterCreation(startCanaryAfterCreation)
      .name(name)
      .artifactS3Location(artifactS3Location)
      .code(code)
      .runtimeVersion(runtimeVersion)
      .executionRoleArn(executionRoleArn)
      .schedule(schedule)
      .visualReference(visualReference.orNull)
      .failureRetentionPeriod(failureRetentionPeriod.orNull)
      .vpcConfig(vpcConfig.orNull)
      .artifactConfig(artifactConfig.orNull)
      .successRetentionPeriod(successRetentionPeriod.orNull)
      .runConfig(runConfig.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
