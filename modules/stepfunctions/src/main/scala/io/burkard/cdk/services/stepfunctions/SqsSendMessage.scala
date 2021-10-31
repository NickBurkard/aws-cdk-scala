package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SqsSendMessage {

  def apply(
    internalResourceId: String,
    delay: Option[software.amazon.awscdk.Duration] = None,
    messageDeduplicationId: Option[String] = None,
    queue: Option[software.amazon.awscdk.services.sqs.IQueue] = None,
    messageBody: Option[software.amazon.awscdk.services.stepfunctions.TaskInput] = None,
    resultPath: Option[String] = None,
    messageGroupId: Option[String] = None,
    resultSelector: Option[Map[String, _]] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.tasks.SqsSendMessage =
    software.amazon.awscdk.services.stepfunctions.tasks.SqsSendMessage.Builder
      .create(stackCtx, internalResourceId)
      .delay(delay.orNull)
      .messageDeduplicationId(messageDeduplicationId.orNull)
      .queue(queue.orNull)
      .messageBody(messageBody.orNull)
      .resultPath(resultPath.orNull)
      .messageGroupId(messageGroupId.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .heartbeat(heartbeat.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .build()
}
