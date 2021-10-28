package io.burkard.cdk.services.stepfunctions

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EksCallProps {

  def apply(
    httpPath: Option[String] = None,
    httpMethod: Option[software.amazon.awscdk.services.stepfunctions.tasks.HttpMethods] = None,
    resultPath: Option[String] = None,
    cluster: Option[software.amazon.awscdk.services.eks.ICluster] = None,
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
      .httpPath(httpPath.orNull)
      .httpMethod(httpMethod.orNull)
      .resultPath(resultPath.orNull)
      .cluster(cluster.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .queryParameters(queryParameters.map(_.view.mapValues(_.asJava).toMap.asJava).orNull)
      .heartbeat(heartbeat.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .requestBody(requestBody.orNull)
      .integrationPattern(integrationPattern.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .build()
}
