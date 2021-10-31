package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SingleStateOptions {

  def apply(
    stateId: Option[String] = None,
    resultPath: Option[String] = None,
    prefixStates: Option[String] = None,
    resultSelector: Option[Map[String, _]] = None,
    inputPath: Option[String] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.SingleStateOptions =
    (new software.amazon.awscdk.services.stepfunctions.SingleStateOptions.Builder)
      .stateId(stateId.orNull)
      .resultPath(resultPath.orNull)
      .prefixStates(prefixStates.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .inputPath(inputPath.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .build()
}
