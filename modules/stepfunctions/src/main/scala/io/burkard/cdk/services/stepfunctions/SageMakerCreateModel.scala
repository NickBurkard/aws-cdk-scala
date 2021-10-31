package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SageMakerCreateModel {

  def apply(
    internalResourceId: String,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    tags: Option[software.amazon.awscdk.services.stepfunctions.TaskInput] = None,
    enableNetworkIsolation: Option[Boolean] = None,
    resultPath: Option[String] = None,
    subnetSelection: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    modelName: Option[String] = None,
    containers: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.IContainerDefinition]] = None,
    resultSelector: Option[Map[String, _]] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    primaryContainer: Option[software.amazon.awscdk.services.stepfunctions.tasks.IContainerDefinition] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateModel =
    software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateModel.Builder
      .create(stackCtx, internalResourceId)
      .role(role.orNull)
      .tags(tags.orNull)
      .enableNetworkIsolation(enableNetworkIsolation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .resultPath(resultPath.orNull)
      .subnetSelection(subnetSelection.orNull)
      .modelName(modelName.orNull)
      .containers(containers.map(_.asJava).orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .vpc(vpc.orNull)
      .primaryContainer(primaryContainer.orNull)
      .heartbeat(heartbeat.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .build()
}
