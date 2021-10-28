package io.burkard.cdk.services.stepfunctions

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SageMakerCreateTrainingJobProps {

  def apply(
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    tags: Option[Map[String, String]] = None,
    vpcConfig: Option[software.amazon.awscdk.services.stepfunctions.tasks.VpcConfig] = None,
    resultPath: Option[String] = None,
    stoppingCondition: Option[software.amazon.awscdk.services.stepfunctions.tasks.StoppingCondition] = None,
    hyperparameters: Option[Map[String, _]] = None,
    resultSelector: Option[Map[String, _]] = None,
    resourceConfig: Option[software.amazon.awscdk.services.stepfunctions.tasks.ResourceConfig] = None,
    trainingJobName: Option[String] = None,
    algorithmSpecification: Option[software.amazon.awscdk.services.stepfunctions.tasks.AlgorithmSpecification] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    inputDataConfig: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.Channel]] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    outputDataConfig: Option[software.amazon.awscdk.services.stepfunctions.tasks.OutputDataConfig] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJobProps =
    (new software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJobProps.Builder)
      .role(role.orNull)
      .tags(tags.map(_.asJava).orNull)
      .vpcConfig(vpcConfig.orNull)
      .resultPath(resultPath.orNull)
      .stoppingCondition(stoppingCondition.orNull)
      .hyperparameters(hyperparameters.map(_.asJava).orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .resourceConfig(resourceConfig.orNull)
      .trainingJobName(trainingJobName.orNull)
      .algorithmSpecification(algorithmSpecification.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .inputDataConfig(inputDataConfig.map(_.asJava).orNull)
      .heartbeat(heartbeat.orNull)
      .outputDataConfig(outputDataConfig.orNull)
      .build()
}
