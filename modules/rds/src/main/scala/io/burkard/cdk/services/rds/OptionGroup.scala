package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OptionGroup {

  def apply(
    internalResourceId: String,
    configurations: List[_ <: software.amazon.awscdk.services.rds.OptionConfiguration],
    engine: software.amazon.awscdk.services.rds.IInstanceEngine,
    description: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.rds.OptionGroup =
    software.amazon.awscdk.services.rds.OptionGroup.Builder
      .create(stackCtx, internalResourceId)
      .configurations(configurations.asJava)
      .engine(engine)
      .description(description.orNull)
      .build()
}
