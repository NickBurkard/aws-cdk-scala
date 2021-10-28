package io.burkard.cdk.services.stepfunctions

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SageMakerCreateEndpointConfig {

  def apply(
    internalResourceId: String,
    productionVariants: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.ProductionVariant]] = None,
    kmsKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    tags: Option[software.amazon.awscdk.services.stepfunctions.TaskInput] = None,
    resultPath: Option[String] = None,
    endpointConfigName: Option[String] = None,
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
      .productionVariants(productionVariants.map(_.asJava).orNull)
      .kmsKey(kmsKey.orNull)
      .tags(tags.orNull)
      .resultPath(resultPath.orNull)
      .endpointConfigName(endpointConfigName.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .heartbeat(heartbeat.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .build()
}
