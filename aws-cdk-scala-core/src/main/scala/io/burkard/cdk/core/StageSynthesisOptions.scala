package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StageSynthesisOptions {

  def apply(
    force: Option[Boolean] = None,
    skipValidation: Option[Boolean] = None,
    validateOnSynthesis: Option[Boolean] = None
  ): software.amazon.awscdk.StageSynthesisOptions =
    (new software.amazon.awscdk.StageSynthesisOptions.Builder)
      .force(force.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .skipValidation(skipValidation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .validateOnSynthesis(validateOnSynthesis.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
