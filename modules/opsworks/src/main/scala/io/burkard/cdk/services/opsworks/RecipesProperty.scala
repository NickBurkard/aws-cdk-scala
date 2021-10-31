package io.burkard.cdk.services.opsworks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RecipesProperty {

  def apply(
    undeploy: Option[List[String]] = None,
    configure: Option[List[String]] = None,
    shutdown: Option[List[String]] = None,
    deploy: Option[List[String]] = None,
    setup: Option[List[String]] = None
  ): software.amazon.awscdk.services.opsworks.CfnLayer.RecipesProperty =
    (new software.amazon.awscdk.services.opsworks.CfnLayer.RecipesProperty.Builder)
      .undeploy(undeploy.map(_.asJava).orNull)
      .configure(configure.map(_.asJava).orNull)
      .shutdown(shutdown.map(_.asJava).orNull)
      .deploy(deploy.map(_.asJava).orNull)
      .setup(setup.map(_.asJava).orNull)
      .build()
}
