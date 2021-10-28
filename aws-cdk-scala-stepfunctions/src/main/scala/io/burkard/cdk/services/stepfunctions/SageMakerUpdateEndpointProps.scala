package io.burkard.cdk.services.stepfunctions

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SageMakerUpdateEndpointProps {

  def apply(
    resultPath: Option[String] = None,
    endpointConfigName: Option[String] = None,
    resultSelector: Option[Map[String, _]] = None,
    endpointName: Option[String] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.SageMakerUpdateEndpointProps =
    (new software.amazon.awscdk.services.stepfunctions.tasks.SageMakerUpdateEndpointProps.Builder)
      .resultPath(resultPath.orNull)
      .endpointConfigName(endpointConfigName.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .endpointName(endpointName.orNull)
      .heartbeat(heartbeat.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .build()
}
