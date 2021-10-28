package io.burkard.cdk.services.emr

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnClusterProps {

  def apply(
    serviceRole: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    bootstrapActions: Option[List[_]] = None,
    configurations: Option[List[_]] = None,
    releaseLabel: Option[String] = None,
    ebsRootVolumeSize: Option[Number] = None,
    name: Option[String] = None,
    jobFlowRole: Option[String] = None,
    kerberosAttributes: Option[software.amazon.awscdk.services.emr.CfnCluster.KerberosAttributesProperty] = None,
    applications: Option[List[_]] = None,
    customAmiId: Option[String] = None,
    instances: Option[software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty] = None,
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
      .serviceRole(serviceRole.orNull)
      .tags(tags.map(_.asJava).orNull)
      .bootstrapActions(bootstrapActions.map(_.asJava).orNull)
      .configurations(configurations.map(_.asJava).orNull)
      .releaseLabel(releaseLabel.orNull)
      .ebsRootVolumeSize(ebsRootVolumeSize.orNull)
      .name(name.orNull)
      .jobFlowRole(jobFlowRole.orNull)
      .kerberosAttributes(kerberosAttributes.orNull)
      .applications(applications.map(_.asJava).orNull)
      .customAmiId(customAmiId.orNull)
      .instances(instances.orNull)
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
