package io.burkard.cdk.services.databrew

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSchedule {

  def apply(
    internalResourceId: String,
    name: String,
    cronExpression: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    jobNames: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.databrew.CfnSchedule =
    software.amazon.awscdk.services.databrew.CfnSchedule.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .cronExpression(cronExpression)
      .tags(tags.map(_.asJava).orNull)
      .jobNames(jobNames.map(_.asJava).orNull)
      .build()
}
