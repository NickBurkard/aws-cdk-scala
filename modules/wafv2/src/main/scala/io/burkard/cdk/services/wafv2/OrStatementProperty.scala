package io.burkard.cdk.services.wafv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OrStatementProperty {

  def apply(
    statements: Option[List[_]] = None
  ): software.amazon.awscdk.services.wafv2.CfnRuleGroup.OrStatementProperty =
    (new software.amazon.awscdk.services.wafv2.CfnRuleGroup.OrStatementProperty.Builder)
      .statements(statements.map(_.asJava).orNull)
      .build()
}
