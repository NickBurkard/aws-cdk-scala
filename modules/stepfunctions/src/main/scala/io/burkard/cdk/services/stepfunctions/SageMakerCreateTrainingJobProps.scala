package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SageMakerCreateTrainingJobProps {

  def apply(
    trainingJobName: String,
    algorithmSpecification: software.amazon.awscdk.services.stepfunctions.tasks.AlgorithmSpecification,
    inputDataConfig: List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.Channel],
    outputDataConfig: software.amazon.awscdk.services.stepfunctions.tasks.OutputDataConfig,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    tags: Option[Map[String, String]] = None,
    enableNetworkIsolation: Option[Boolean] = None,
    vpcConfig: Option[software.amazon.awscdk.services.stepfunctions.tasks.VpcConfig] = None,
    resultPath: Option[String] = None,
    stoppingCondition: Option[software.amazon.awscdk.services.stepfunctions.tasks.StoppingCondition] = None,
    hyperparameters: Option[Map[String, _]] = None,
    resultSelector: Option[Map[String, _]] = None,
    resourceConfig: Option[software.amazon.awscdk.services.stepfunctions.tasks.ResourceConfig] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJobProps =
    (new software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJobProps.Builder)
      .trainingJobName(trainingJobName)
      .algorithmSpecification(algorithmSpecification)
      .inputDataConfig(inputDataConfig.asJava)
      .outputDataConfig(outputDataConfig)
      .role(role.orNull)
      .tags(tags.map(_.asJava).orNull)
      .enableNetworkIsolation(enableNetworkIsolation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .vpcConfig(vpcConfig.orNull)
      .resultPath(resultPath.orNull)
      .stoppingCondition(stoppingCondition.orNull)
      .hyperparameters(hyperparameters.map(_.asJava).orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .resourceConfig(resourceConfig.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .heartbeat(heartbeat.orNull)
      .build()
}
