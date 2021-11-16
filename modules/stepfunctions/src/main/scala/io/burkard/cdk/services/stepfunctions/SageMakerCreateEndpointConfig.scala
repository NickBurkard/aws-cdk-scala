package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SageMakerCreateEndpointConfig {

  def apply(
    internalResourceId: String,
    productionVariants: List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.ProductionVariant],
    endpointConfigName: String,
    kmsKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    tags: Option[software.amazon.awscdk.services.stepfunctions.TaskInput] = None,
    resultPath: Option[String] = None,
    resultSelector: Option[Map[String, _]] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateEndpointConfig =
    software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateEndpointConfig.Builder
      .create(stackCtx, internalResourceId)
      .productionVariants(productionVariants.asJava)
      .endpointConfigName(endpointConfigName)
      .kmsKey(kmsKey.orNull)
      .tags(tags.orNull)
      .resultPath(resultPath.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .heartbeat(heartbeat.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .build()
}
