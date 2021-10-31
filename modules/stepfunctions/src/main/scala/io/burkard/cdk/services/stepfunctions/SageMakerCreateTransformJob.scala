package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SageMakerCreateTransformJob {

  def apply(
    internalResourceId: String,
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
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJob =
    software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJob.Builder
      .create(stackCtx, internalResourceId)
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
