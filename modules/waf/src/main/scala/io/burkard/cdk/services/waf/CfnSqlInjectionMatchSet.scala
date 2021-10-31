package io.burkard.cdk.services.waf

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSqlInjectionMatchSet {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    sqlInjectionMatchTuples: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet =
    software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .sqlInjectionMatchTuples(sqlInjectionMatchTuples.map(_.asJava).orNull)
      .build()
}
