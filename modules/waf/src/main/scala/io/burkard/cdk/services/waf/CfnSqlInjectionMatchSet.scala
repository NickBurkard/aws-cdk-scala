package io.burkard.cdk.services.waf

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSqlInjectionMatchSet {

  def apply(
    internalResourceId: String,
    name: String,
    sqlInjectionMatchTuples: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet =
    software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .sqlInjectionMatchTuples(sqlInjectionMatchTuples.map(_.asJava).orNull)
      .build()
}
