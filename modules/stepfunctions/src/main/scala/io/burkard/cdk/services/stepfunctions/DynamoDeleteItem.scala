package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DynamoDeleteItem {

  def apply(
    internalResourceId: String,
    key: Option[Map[String, _ <: software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue]] = None,
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
    heartbeat: Option[software.amazon.awscdk.Duration] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.tasks.DynamoDeleteItem =
    software.amazon.awscdk.services.stepfunctions.tasks.DynamoDeleteItem.Builder
      .create(stackCtx, internalResourceId)
      .key(key.map(_.asJava).orNull)
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
      .build()
}
