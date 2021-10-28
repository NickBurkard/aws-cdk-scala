package io.burkard.cdk.services.stepfunctions

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DynamoGetItemProps {

  def apply(
    consistentRead: Option[Boolean] = None,
    resultPath: Option[String] = None,
    projectionExpression: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.DynamoProjectionExpression]] = None,
    key: Option[Map[String, _ <: software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue]] = None,
    returnConsumedCapacity: Option[software.amazon.awscdk.services.stepfunctions.tasks.DynamoConsumedCapacity] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    expressionAttributeNames: Option[Map[String, String]] = None,
    resultSelector: Option[Map[String, _]] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    table: Option[software.amazon.awscdk.services.dynamodb.ITable] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItemProps =
    (new software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItemProps.Builder)
      .consistentRead(consistentRead.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .resultPath(resultPath.orNull)
      .projectionExpression(projectionExpression.map(_.asJava).orNull)
      .key(key.map(_.asJava).orNull)
      .returnConsumedCapacity(returnConsumedCapacity.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .expressionAttributeNames(expressionAttributeNames.map(_.asJava).orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .table(table.orNull)
      .heartbeat(heartbeat.orNull)
      .build()
}
