package io.burkard.cdk.services.wafv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RuleGroupReferenceStatementProperty {

  def apply(
    arn: String,
    excludedRules: Option[List[_]] = None
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.RuleGroupReferenceStatementProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.RuleGroupReferenceStatementProperty.Builder)
      .arn(arn)
      .excludedRules(excludedRules.map(_.asJava).orNull)
      .build()
}
