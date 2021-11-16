package io.burkard.cdk.services.accessanalyzer

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAnalyzer {

  def apply(
    internalResourceId: String,
    `type`: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    analyzerName: Option[String] = None,
    archiveRules: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer =
    software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.Builder
      .create(stackCtx, internalResourceId)
      .`type`(`type`)
      .tags(tags.map(_.asJava).orNull)
      .analyzerName(analyzerName.orNull)
      .archiveRules(archiveRules.map(_.asJava).orNull)
      .build()
}
