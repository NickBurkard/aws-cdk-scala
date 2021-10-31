package io.burkard.cdk.services.appsync

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PipelineConfigProperty {

  def apply(
    functions: Option[List[String]] = None
  ): software.amazon.awscdk.services.appsync.CfnResolver.PipelineConfigProperty =
    (new software.amazon.awscdk.services.appsync.CfnResolver.PipelineConfigProperty.Builder)
      .functions(functions.map(_.asJava).orNull)
      .build()
}
