package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CatchProps {

  def apply(
    errors: Option[List[String]] = None,
    resultPath: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.CatchProps =
    (new software.amazon.awscdk.services.stepfunctions.CatchProps.Builder)
      .errors(errors.map(_.asJava).orNull)
      .resultPath(resultPath.orNull)
      .build()
}
