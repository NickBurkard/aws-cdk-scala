package io.burkard.cdk.services.databrew

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnScheduleProps {

  def apply(
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    jobNames: Option[List[String]] = None,
    cronExpression: Option[String] = None
  ): software.amazon.awscdk.services.databrew.CfnScheduleProps =
    (new software.amazon.awscdk.services.databrew.CfnScheduleProps.Builder)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .jobNames(jobNames.map(_.asJava).orNull)
      .cronExpression(cronExpression.orNull)
      .build()
}
