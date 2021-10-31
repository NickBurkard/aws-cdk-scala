package io.burkard.cdk.services.logs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnQueryDefinitionProps {

  def apply(
    name: Option[String] = None,
    logGroupNames: Option[List[String]] = None,
    queryString: Option[String] = None
  ): software.amazon.awscdk.services.logs.CfnQueryDefinitionProps =
    (new software.amazon.awscdk.services.logs.CfnQueryDefinitionProps.Builder)
      .name(name.orNull)
      .logGroupNames(logGroupNames.map(_.asJava).orNull)
      .queryString(queryString.orNull)
      .build()
}
