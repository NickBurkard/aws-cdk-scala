package io.burkard.cdk.services.emr

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnClusterProps {

  def apply(
    serviceRole: String,
    name: String,
    jobFlowRole: String,
    instances: software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    bootstrapActions: Option[List[_]] = None,
    configurations: Option[List[_]] = None,
    releaseLabel: Option[String] = None,
    ebsRootVolumeSize: Option[Number] = None,
    kerberosAttributes: Option[software.amazon.awscdk.services.emr.CfnCluster.KerberosAttributesProperty] = None,
    applications: Option[List[_]] = None,
    customAmiId: Option[String] = None,
    visibleToAllUsers: Option[Boolean] = None,
    logEncryptionKmsKeyId: Option[String] = None,
    managedScalingPolicy: Option[software.amazon.awscdk.services.emr.CfnCluster.ManagedScalingPolicyProperty] = None,
    scaleDownBehavior: Option[String] = None,
    securityConfiguration: Option[String] = None,
    logUri: Option[String] = None,
    autoScalingRole: Option[String] = None,
    stepConcurrencyLevel: Option[Number] = None,
    additionalInfo: Option[AnyRef] = None,
    steps: Option[List[_]] = None
  ): software.amazon.awscdk.services.emr.CfnClusterProps =
    (new software.amazon.awscdk.services.emr.CfnClusterProps.Builder)
      .serviceRole(serviceRole)
      .name(name)
      .jobFlowRole(jobFlowRole)
      .instances(instances)
      .tags(tags.map(_.asJava).orNull)
      .bootstrapActions(bootstrapActions.map(_.asJava).orNull)
      .configurations(configurations.map(_.asJava).orNull)
      .releaseLabel(releaseLabel.orNull)
      .ebsRootVolumeSize(ebsRootVolumeSize.orNull)
      .kerberosAttributes(kerberosAttributes.orNull)
      .applications(applications.map(_.asJava).orNull)
      .customAmiId(customAmiId.orNull)
      .visibleToAllUsers(visibleToAllUsers.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .logEncryptionKmsKeyId(logEncryptionKmsKeyId.orNull)
      .managedScalingPolicy(managedScalingPolicy.orNull)
      .scaleDownBehavior(scaleDownBehavior.orNull)
      .securityConfiguration(securityConfiguration.orNull)
      .logUri(logUri.orNull)
      .autoScalingRole(autoScalingRole.orNull)
      .stepConcurrencyLevel(stepConcurrencyLevel.orNull)
      .additionalInfo(additionalInfo.orNull)
      .steps(steps.map(_.asJava).orNull)
      .build()
}
