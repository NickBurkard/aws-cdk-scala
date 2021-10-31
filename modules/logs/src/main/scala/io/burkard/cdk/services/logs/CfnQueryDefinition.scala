package io.burkard.cdk.services.logs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnQueryDefinition {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    logGroupNames: Option[List[String]] = None,
    queryString: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.logs.CfnQueryDefinition =
    software.amazon.awscdk.services.logs.CfnQueryDefinition.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .logGroupNames(logGroupNames.map(_.asJava).orNull)
      .queryString(queryString.orNull)
      .build()
}
