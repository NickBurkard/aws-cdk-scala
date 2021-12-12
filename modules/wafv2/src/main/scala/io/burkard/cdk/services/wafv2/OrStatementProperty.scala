package io.burkard.cdk.services.wafv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OrStatementProperty {

  def apply(
    statements: List[_]
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.OrStatementProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.OrStatementProperty.Builder)
      .statements(statements.asJava)
      .build()
}
