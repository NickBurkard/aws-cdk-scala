package io.burkard.cdk.services.stepfunctions

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DynamoPutItemProps {

  def apply(
    conditionExpression: Option[String] = None,
    resultPath: Option[String] = None,
    expressionAttributeValues: Option[Map[String, _ <: software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue]] = None,
    returnValues: Option[software.amazon.awscdk.services.stepfunctions.tasks.DynamoReturnValues] = None,
    returnConsumedCapacity: Option[software.amazon.awscdk.services.stepfunctions.tasks.DynamoConsumedCapacity] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    expressionAttributeNames: Option[Map[String, String]] = None,
    resultSelector: Option[Map[String, _]] = None,
    returnItemCollectionMetrics: Option[software.amazon.awscdk.services.stepfunctions.tasks.DynamoItemCollectionMetrics] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    table: Option[software.amazon.awscdk.services.dynamodb.ITable] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    item: Option[Map[String, _ <: software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue]] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.DynamoPutItemProps =
    (new software.amazon.awscdk.services.stepfunctions.tasks.DynamoPutItemProps.Builder)
      .conditionExpression(conditionExpression.orNull)
      .resultPath(resultPath.orNull)
      .expressionAttributeValues(expressionAttributeValues.map(_.asJava).orNull)
      .returnValues(returnValues.orNull)
      .returnConsumedCapacity(returnConsumedCapacity.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .expressionAttributeNames(expressionAttributeNames.map(_.asJava).orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .returnItemCollectionMetrics(returnItemCollectionMetrics.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .table(table.orNull)
      .heartbeat(heartbeat.orNull)
      .item(item.map(_.asJava).orNull)
      .build()
}
