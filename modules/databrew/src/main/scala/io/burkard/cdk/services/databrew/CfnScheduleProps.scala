package io.burkard.cdk.services.databrew

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnScheduleProps {

  def apply(
    name: String,
    cronExpression: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    jobNames: Option[List[String]] = None
  ): software.amazon.awscdk.services.databrew.CfnScheduleProps =
    (new software.amazon.awscdk.services.databrew.CfnScheduleProps.Builder)
      .name(name)
      .cronExpression(cronExpression)
      .tags(tags.map(_.asJava).orNull)
      .jobNames(jobNames.map(_.asJava).orNull)
      .build()
}
