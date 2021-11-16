package io.burkard.cdk.services.accessanalyzer

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ArchiveRuleProperty {

  def apply(
    ruleName: String,
    filter: List[_]
  ): software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.ArchiveRuleProperty =
    (new software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.ArchiveRuleProperty.Builder)
      .ruleName(ruleName)
      .filter(filter.asJava)
      .build()
}
