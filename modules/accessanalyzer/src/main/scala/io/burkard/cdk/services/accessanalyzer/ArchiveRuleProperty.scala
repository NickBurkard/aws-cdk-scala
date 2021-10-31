package io.burkard.cdk.services.accessanalyzer

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ArchiveRuleProperty {

  def apply(
    ruleName: Option[String] = None,
    filter: Option[List[_]] = None
  ): software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.ArchiveRuleProperty =
    (new software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.ArchiveRuleProperty.Builder)
      .ruleName(ruleName.orNull)
      .filter(filter.map(_.asJava).orNull)
      .build()
}
