package io.burkard.cdk.services.wafv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ManagedRuleGroupStatementProperty {

  def apply(
    name: String,
    vendorName: String,
    scopeDownStatement: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.StatementProperty] = None,
    version: Option[String] = None,
    excludedRules: Option[List[_]] = None
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.ManagedRuleGroupStatementProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.ManagedRuleGroupStatementProperty.Builder)
      .name(name)
      .vendorName(vendorName)
      .scopeDownStatement(scopeDownStatement.orNull)
      .version(version.orNull)
      .excludedRules(excludedRules.map(_.asJava).orNull)
      .build()
}
