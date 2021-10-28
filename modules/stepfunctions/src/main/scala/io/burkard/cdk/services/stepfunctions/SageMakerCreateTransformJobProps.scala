package io.burkard.cdk.services.stepfunctions

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SageMakerCreateTransformJobProps {

  def apply(
    maxPayload: Option[software.amazon.awscdk.Size] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    tags: Option[Map[String, String]] = None,
    batchStrategy: Option[software.amazon.awscdk.services.stepfunctions.tasks.BatchStrategy] = None,
    resultPath: Option[String] = None,
    maxConcurrentTransforms: Option[Number] = None,
    environment: Option[Map[String, String]] = None,
    modelClientOptions: Option[software.amazon.awscdk.services.stepfunctions.tasks.ModelClientOptions] = None,
    resultSelector: Option[Map[String, _]] = None,
    transformOutput: Option[software.amazon.awscdk.services.stepfunctions.tasks.TransformOutput] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    transformInput: Option[software.amazon.awscdk.services.stepfunctions.tasks.TransformInput] = None,
    transformResources: Option[software.amazon.awscdk.services.stepfunctions.tasks.TransformResources] = None,
    transformJobName: Option[String] = None,
    modelName: Option[String] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJobProps =
    (new software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJobProps.Builder)
      .maxPayload(maxPayload.orNull)
      .role(role.orNull)
      .tags(tags.map(_.asJava).orNull)
      .batchStrategy(batchStrategy.orNull)
      .resultPath(resultPath.orNull)
      .maxConcurrentTransforms(maxConcurrentTransforms.orNull)
      .environment(environment.map(_.asJava).orNull)
      .modelClientOptions(modelClientOptions.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .transformOutput(transformOutput.orNull)
      .heartbeat(heartbeat.orNull)
      .transformInput(transformInput.orNull)
      .transformResources(transformResources.orNull)
      .transformJobName(transformJobName.orNull)
      .modelName(modelName.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .build()
}
