package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EksCallProps {

  def apply(
    httpPath: String,
    httpMethod: software.amazon.awscdk.services.stepfunctions.tasks.HttpMethods,
    cluster: software.amazon.awscdk.services.eks.ICluster,
    resultPath: Option[String] = None,
    resultSelector: Option[Map[String, _]] = None,
    queryParameters: Option[Map[String, _ <: List[String]]] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    requestBody: Option[software.amazon.awscdk.services.stepfunctions.TaskInput] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EksCallProps =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EksCallProps.Builder)
      .httpPath(httpPath)
      .httpMethod(httpMethod)
      .cluster(cluster)
      .resultPath(resultPath.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .queryParameters(queryParameters.map(_.mapValues(_.asJava).toMap.asJava).orNull)
      .heartbeat(heartbeat.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .requestBody(requestBody.orNull)
      .integrationPattern(integrationPattern.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .build()
}
