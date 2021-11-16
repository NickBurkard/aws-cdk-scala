package io.burkard.cdk.services.logs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnQueryDefinitionProps {

  def apply(
    name: String,
    queryString: String,
    logGroupNames: Option[List[String]] = None
  ): software.amazon.awscdk.services.logs.CfnQueryDefinitionProps =
    (new software.amazon.awscdk.services.logs.CfnQueryDefinitionProps.Builder)
      .name(name)
      .queryString(queryString)
      .logGroupNames(logGroupNames.map(_.asJava).orNull)
      .build()
}
