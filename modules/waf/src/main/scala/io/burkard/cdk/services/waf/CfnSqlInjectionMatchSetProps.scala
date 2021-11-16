package io.burkard.cdk.services.waf

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSqlInjectionMatchSetProps {

  def apply(
    name: String,
    sqlInjectionMatchTuples: Option[List[_]] = None
  ): software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSetProps =
    (new software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSetProps.Builder)
      .name(name)
      .sqlInjectionMatchTuples(sqlInjectionMatchTuples.map(_.asJava).orNull)
      .build()
}
