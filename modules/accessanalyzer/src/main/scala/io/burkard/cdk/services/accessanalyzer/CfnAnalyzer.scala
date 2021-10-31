package io.burkard.cdk.services.accessanalyzer

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAnalyzer {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    analyzerName: Option[String] = None,
    `type`: Option[String] = None,
    archiveRules: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer =
    software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .analyzerName(analyzerName.orNull)
      .`type`(`type`.orNull)
      .archiveRules(archiveRules.map(_.asJava).orNull)
      .build()
}
