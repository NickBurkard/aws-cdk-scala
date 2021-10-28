package io.burkard.cdk.services.wafv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AndStatementProperty {

  def apply(
    statements: Option[List[_]] = None
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.AndStatementProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.AndStatementProperty.Builder)
      .statements(statements.map(_.asJava).orNull)
      .build()
}
