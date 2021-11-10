package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EmrCreateCluster {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    serviceRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    tags: Option[Map[String, String]] = None,
    bootstrapActions: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.BootstrapActionConfigProperty]] = None,
    resultPath: Option[String] = None,
    visibleToAllUsers: Option[Boolean] = None,
    autoTerminationPolicy: Option[software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.AutoTerminationPolicyProperty] = None,
    resultSelector: Option[Map[String, _]] = None,
    additionalInfo: Option[String] = None,
    configurations: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ConfigurationProperty]] = None,
    releaseLabel: Option[String] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    kerberosAttributes: Option[software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.KerberosAttributesProperty] = None,
    applications: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ApplicationConfigProperty]] = None,
    customAmiId: Option[String] = None,
    instances: Option[software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstancesConfigProperty] = None,
    scaleDownBehavior: Option[software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EmrClusterScaleDownBehavior] = None,
    securityConfiguration: Option[String] = None,
    logUri: Option[String] = None,
    clusterRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    autoScalingRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    stepConcurrencyLevel: Option[Number] = None,
    inputPath: Option[String] = None,
    ebsRootVolumeSize: Option[software.amazon.awscdk.Size] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster =
    software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .serviceRole(serviceRole.orNull)
      .tags(tags.map(_.asJava).orNull)
      .bootstrapActions(bootstrapActions.map(_.asJava).orNull)
      .resultPath(resultPath.orNull)
      .visibleToAllUsers(visibleToAllUsers.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .autoTerminationPolicy(autoTerminationPolicy.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .additionalInfo(additionalInfo.orNull)
      .configurations(configurations.map(_.asJava).orNull)
      .releaseLabel(releaseLabel.orNull)
      .heartbeat(heartbeat.orNull)
      .kerberosAttributes(kerberosAttributes.orNull)
      .applications(applications.map(_.asJava).orNull)
      .customAmiId(customAmiId.orNull)
      .instances(instances.orNull)
      .scaleDownBehavior(scaleDownBehavior.orNull)
      .securityConfiguration(securityConfiguration.orNull)
      .logUri(logUri.orNull)
      .clusterRole(clusterRole.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .autoScalingRole(autoScalingRole.orNull)
      .stepConcurrencyLevel(stepConcurrencyLevel.orNull)
      .inputPath(inputPath.orNull)
      .ebsRootVolumeSize(ebsRootVolumeSize.orNull)
      .timeout(timeout.orNull)
      .build()
}
