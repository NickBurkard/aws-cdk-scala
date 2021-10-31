package io.burkard.cdk.services.waf

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSqlInjectionMatchSetProps {

  def apply(
    name: Option[String] = None,
    sqlInjectionMatchTuples: Option[List[_]] = None
  ): software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSetProps =
    (new software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSetProps.Builder)
      .name(name.orNull)
      .sqlInjectionMatchTuples(sqlInjectionMatchTuples.map(_.asJava).orNull)
      .build()
}
